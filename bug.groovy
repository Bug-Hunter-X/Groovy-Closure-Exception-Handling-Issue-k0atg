```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

methodWithClosure {  
  //Some code here that throws exception
  println "Inside closure"
}
```
This code snippet demonstrates a common issue when using closures in Groovy. If the code inside the closure throws an exception, it won't be caught by a `try-catch` block outside the closure.  The `println` statement after the closure execution will still print even if there is an exception inside the closure.

This happens because the closure has its own scope and exception handling mechanism.