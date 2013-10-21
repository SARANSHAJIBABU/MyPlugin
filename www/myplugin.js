var myplugin = {
    createEvent: function(successCallback, errorCallback) {
        cordova.exec(
            successCallback, // success callback function
            errorCallback, // error callback function
            'MyPlugin', // mapped to our native Java class called "MyPlugin"
            'beep', // with this action name
            [                 // and this array of custom arguments to create our entry
                "Saran"
            ]
        ); 
    }
}
module.exports = myplugin;