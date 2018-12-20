var digital = {
    conectar: function (success, error) {
        var options = {};
        cordova.exec(success, error, 'Digital', 'conectar', [options]);
    }    
  }
  
  cordova.addConstructor(function () {
    if (!window.plugins) {
      window.plugins = {};
    }
    console.log("construtor");
  
    window.plugins.digital = digital;
    return window.plugins.digital;
  });