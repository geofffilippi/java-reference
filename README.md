# java-reference
This is a reference project that demonstrates the core features of Java

# Command line
`javac -d build ./src/com/geofffilippi/javaReference/JavaReference.java`
`java -cp build com/geofffilippi/javaReference/JavaReference`

# run watcher
`homebrew fswatch`
`fswatch -o JavaReference.java | xargs -n1 -I{} ./handle_change`

# Testing
`javac -cp .:./build:./junit-4.11.jar:./hamcrest-core-1.3.jar FooTest.java`
`java -cp .:./build:./junit-4.11.jar:./hamcrest-core-1.3.jar org.junit.runner.JUnitCore FooTest`

# References
[javadoc]: http://docs.oracle.com/javase/6/docs/api/overview-summary.html
[javalang]: http://docs.oracle.com/javase/7/docs/api/java/lang/package-summary.html
[javalangstring]: http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
[corejava]: http://www.horstmann.com/corejava.html "Core Java"
[javac]: http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html
[junit]: https://github.com/junit-team/junit "JUnit"
[downloadjunit]: https://github.com/junit-team/junit/wiki/Download-and-Install
[static]: http://stackoverflow.com/questions/413898/what-does-the-static-keyword-do-in-a-class
[final]: http://en.wikipedia.org/wiki/Final_(Java)
