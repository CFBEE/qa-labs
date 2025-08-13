/**
 * 
 */
/**
 * 
 */
module QA_Labs {
	requires java.desktop;
    requires com.google.gson;
    requires java.sql;
    requires org.junit.jupiter.api;
    requires org.junit.platform.commons;

    opens main.java.lab11_Testing to org.junit.platform.commons;
    opens main.java.lab12_AccessingFiles to gson;
}