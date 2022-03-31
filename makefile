JFLAGS = -d bin -sourcepath src

compile:
	javac ${JFLAGS} -cp . src/**/*.java

clean:
	rm -f *~
	rm -f ./bin/**/*.class

demo: ./bin/**/*.class
	java -cp bin templatemethod.Demo


