# Groovy Closure Exception Handling

This repository demonstrates a common issue related to exception handling when working with closures in Groovy.  Exceptions thrown inside a closure are not automatically caught by `try-catch` blocks in the surrounding code. 

The `bug.groovy` file shows the problematic code. The `bugSolution.groovy` file presents a solution to address this issue.

## Problem

When an exception is thrown within a closure in Groovy, it won't be caught by a `try-catch` block that's outside the closure unless it is explicitly handled within the closure itself. This can lead to unexpected behavior and make debugging difficult.

## Solution

To handle exceptions properly, you need to include a `try-catch` block within the closure itself, as shown in `bugSolution.groovy`. This allows for proper exception handling within the closure's scope.