var huellero = {
    conectar: function (success, error) {
        var options = {};
        cordova.exec(success, error, 'Huellero', 'conectar', [options]);
    },
    capturar: function (success, error) {
      var options = {};
      cordova.exec(success, error, 'Huellero', 'capturar', [options]);
    }
    
  }
  
  //NO TOCAR, SOLO INSTALACION
  cordova.addConstructor(function () {
    if (!window.plugins) {
      window.plugins = {};
    }
  
    window.plugins.huellero = huellero;
    return window.plugins.huellero;
  });