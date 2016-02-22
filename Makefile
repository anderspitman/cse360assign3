NAME=Driver
PACKAGE_NAME=cse360assign3
DIR=.
SOURCE_DIR=$(DIR)/sources/$(PACKAGE_NAME)
CLASS_DIR=$(DIR)/classes
TEST_DIR=$(DIR)/sources/test

LIB_DIR=$(DIR)/../lib
JUNIT=$(LIB_DIR)/junit/junit-4.12.jar:$(LIB_DIR)/junit/hamcrest-core-1.3.jar
CLASSPATH=$(CLASS_DIR):$(TEST_DIR):$(JUNIT)
JAVA_OPTIONS=-cp $(CLASSPATH)

SOURCE_NAMES=$(NAME) Calculator
SOURCE_FILES=$(SOURCE_NAMES:=.java)
CLASS_FILES=$(SOURCE_FILES:.java=.class)
SOURCES=$(addprefix $(SOURCE_DIR)/, $(SOURCE_FILES))
CLASSES=$(addprefix $(CLASS_DIR)/$(PACKAGE_NAME)/, $(CLASS_FILES))

TEST_NAMES=CalculatorTest
TEST_FILES=$(TEST_NAMES:=.java)
TEST_SOURCES=$(addprefix $(TEST_DIR)/$(PACKAGE_NAME)/, $(TEST_FILES))
TEST_CLASSES=$(TEST_SOURCES:.java=.class)
TEST_RUN_NAMES=$(addprefix $(PACKAGE_NAME).,$(TEST_NAMES))

run: all
	java $(JAVA_OPTIONS) $(PACKAGE_NAME).$(NAME) 

all: $(CLASSES)

$(CLASSES): $(SOURCES)
	javac $(SOURCES) -d $(CLASS_DIR)

test: $(TEST_CLASSES)
	java $(JAVA_OPTIONS) org.junit.runner.JUnitCore $(TEST_RUN_NAMES)

$(TEST_CLASSES): $(CLASSES) $(TEST_SOURCES)
	javac $(JAVA_OPTIONS) $(TEST_SOURCES)

.PHONY: clean
clean:
	$(RM) -rf $(CLASS_DIR)/* $(TEST_DIR)/$(PACKAGE_NAME)/*.class
