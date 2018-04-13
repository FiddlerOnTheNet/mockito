# Compile
javac -classpath .:./junit-4.12.jar:./hamcrest-core-1.3.jar:./build/classes/java/main ErrorTest*Minimized.java -sourcepath ./build/classes/java/main/

# Run
java -classpath .:./junit-4.12.jar:./hamcrest-core-1.3.jar:./build/classes/java/main org.junit.runner.JUnitCore ErrorTest0Minimized > run_randoop_test_output.txt
