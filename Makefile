.PHONY: test

testbuild: build
	java -jar SphereMain.jar

build: Main.class
	jar cvfm SphereMain.jar manifest.txt geometry/Sphere.class geometry/Main.class

test: Main.class
	java geometry/Main

Main.class: geometry/Main.java
	javac geometry/Main.java geometry/Sphere.java
