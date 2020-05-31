var myRevealingModule = (function() {
    var privateCounter = 0;

    function privateFunction() {
        privateCounter++;
    }

    function publicFunction() {
        publicIncrement();
        return privateCounter;
    }

    function publicIncrement() {
        privateFunction();
    }

    function getCounter() {
        return privateCounter;
    }

    return {
        start: publicFunction,
        increment: publicIncrement,
        counter: getCounter
    }
})();

console.log(myRevealingModule.start());

myRevealingModule.increment();
myRevealingModule.increment();
myRevealingModule.increment();

console.log(myRevealingModule.counter());
