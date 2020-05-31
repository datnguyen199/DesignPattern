var exposer = (function() {
    var privateVariable = 100;

    var privateMethod = function() {
        console.log('private method');
        privateVariable++;
    }

    var methodExpose = function() {
        console.log('this is method expose');
    }

    var anotherExposeMethod = function() {
        privateMethod();
    }

    var getVariable = function() {
        return privateVariable;
    }

    return { methodExpose, anotherExposeMethod, getVariable }
})();

exposer.methodExpose();
exposer.anotherExposeMethod();
console.log(exposer.getVariable());
