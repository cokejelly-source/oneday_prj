/**
 * 맵 자바스크립트
 */
document.addEventListener("DOMContentLoaded", function () {
    
    var mapContainer = document.getElementById('map'); // 지도를 표시할 div
    
    // 1. 전달받은 데이터 콘솔 확인
    console.log("전달받은 클래스 목록:", typeof classListData !== 'undefined' ? classListData : []);

    // 기본 중심 좌표 (서울시청)
    var defaultLat = 37.5381;
    var defaultLng = 127.11609;

    if (typeof classListData !== 'undefined' && classListData.length > 0 && classListData[0].lat && classListData[0].lng) {
        defaultLat = classListData[0].lat;
        defaultLng = classListData[0].lng;
    }

    var mapOption = {
        center: new kakao.maps.LatLng(defaultLat, defaultLng),
        level: 3
    };

    // 지도 생성
    var map = new kakao.maps.Map(mapContainer, mapOption);

    // 마커 이미지 설정
    var imageSrc = "https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";
    var imageSize = new kakao.maps.Size(24, 35);
    var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize);

    // 2. 동적 마커 생성
    if (typeof classListData !== 'undefined' && classListData.length > 0) {
        var bounds = new kakao.maps.LatLngBounds();
        var hasValidMarker = false;

        classListData.forEach(function (item) {
            if (item.lat && item.lng) {
                var latlng = new kakao.maps.LatLng(item.lat, item.lng);

                var marker = new kakao.maps.Marker({
                    map: map,
                    position: latlng,
                    title: item.name,
                    image: markerImage  // 💡 makerImage 오타 수정
                });

                bounds.extend(latlng);
                hasValidMarker = true;
            }
        });

        // 유효한 마커가 1개 이상 있을 때만 영역 재설정
        if (hasValidMarker) {
            map.setBounds(bounds);
        }
    }
});