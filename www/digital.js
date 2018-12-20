var digital = {
    conectar: function (success, error) {
      console.log("construtor");
        var options = {};
        cordova.exec(success, error, 'Digital', 'conectar', [options]);
    }    
  }
  
  cordova.addConstructor(function () {
    if (!window.plugins) {
      window.plugins = {};
    }
  
    window.plugins.digital = digital;
    return window.plugins.digital;
  });