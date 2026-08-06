package kr.co.oneday.mybatis;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class MyBatisHandler {

	private static MyBatisHandler mbh;
	private static SqlSessionFactory ssf;
	
	private MyBatisHandler() {
		org.apache.ibatis.logging.LogFactory.useLog4J2Logging();
	}//MyBatisHandler
	
	public static MyBatisHandler getInstance() {
		if(mbh == null) {
			mbh=new MyBatisHandler();
		}//end if
		return mbh;
	}//getInstance
	
	private SqlSessionFactory getSessionFactory(String configPath) {
		if(ssf == null) {
			Reader reader=null;
			 
			File file=new File( configPath );
			SAXBuilder builder=new SAXBuilder();
			try {
				Document doc=builder.build(file);
				Element rootNode=doc.getRootElement();//최상위 노드<path>
				Element configPathNode=rootNode.getChild("config-path");
				
				//1.설정파일을 Stream 연결
				reader=Resources.getResourceAsReader( configPathNode.getText() );
				//2.MyBatis Framework( SqlSessionFactoryBuilder)을 생성
				ssf=new SqlSessionFactoryBuilder().build(reader);
				
				if(reader != null) {reader.close();	}//end if
				
			} catch (JDOMException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}//end catch
			
		}//end if
		return ssf;
	}//getSessionFactory
	
	/**
	 * MyBatis Handler 얻기 : autocommit 설정되지 않은 Handler 얻기
	 * @param path config 파일의 경로 : null이나 empty면 기본 c:/dev/config디렉토리에서 읽어들인다.
	 * @return autocommit 설정되지 않은 Handler
	 */
	public SqlSession getMyBatisHandler(String path) {
		if(path == null || "".equals(path)) { //path가 null 또는 ""라면 기본 설정경로의 설정파일을 로딩
			path="C:/dev/config/config-path.xml";
		}//end if
		SqlSession ss=getSessionFactory(path).openSession();
		return ss;
	}//getMyBatisHandler
	
	/**
	 * MyBatis Handler 얻기 : autocommit을 설정하는 Handler 얻기
	 * @param path config 파일의 경로 : null이나 empty면 기본 c:/dev/config디렉토리에서 읽어들인다
	 * @param commitFlag true -autocommit 설제, false- autocommit 해제
	 * @return 설정된 Handler
	 */
	public SqlSession getMyBatisHandler(String path,boolean commitFlag) {
		if(path == null || "".equals(path)) { //path가 null 또는 ""라면 기본 설정경로의 설정파일을 로딩
			path="C:/dev/config/config-path.xml";
		}//end if
		SqlSession ss=getSessionFactory(path).openSession(commitFlag);
		return ss;
	}//getMyBatisHandler
	
	/**
	 * Handler를 닫는 method
	 * @param ss
	 */
	public void closeHandler(SqlSession ss) {
		if( ss != null ) {ss.close(); }//end if
	}//closeHandler
	
}//class
