let map
function initMap() {
  var mapOptions = {
    center: { lat: -27.19517, lng: -53.710503 },
    zoom: 20,
    mapTypeId: google.maps.MapTypeId.SATELLITE
  }
  var map = new google.maps.Map(document.getElementById('map'), mapOptions)

  var marcador = new google.maps.Marker({
    position: { lat: -27.19517, lng: -53.710503 },
    map: map,
    title: 'Aqui é minha casa!!'
  })
}
google.maps.event.addDomListener(window, 'load', initMap)
window.initMap = initMap
