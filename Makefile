.PHONY: test
test: Main.class
	java geometry/Main

Main.class: geometry/Main.java
	javac geometry/Main.java
