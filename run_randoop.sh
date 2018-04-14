# Set up repo
cd /tmp
git clone https://github.com/FiddlerOnTheNet/mockito
cd mockito

# Compile and run randoop
./gradlew clean compileJava
java -classpath "./randoop-4.0.1/randoop-all-4.0.1.jar:./build/classes/java/main/:." randoop.main.Main gentests --classlist=myclasses_util.txt --time-limit=300 --log="run_randoop.log" --minimize-error-test=true --check-compilable=true --usethreads=true

# Compile generated tests
javac -classpath .:./junit-4.12.jar:./hamcrest-core-1.3.jar:./build/classes/java/main ErrorTest*Minimized.java -sourcepath ./build/classes/java/main/

# Run generated tests
java -classpath .:./junit-4.12.jar:./hamcrest-core-1.3.jar:./build/classes/java/main org.junit.runner.JUnitCore ErrorTest0Minimized > run_randoop_test_output.txt
