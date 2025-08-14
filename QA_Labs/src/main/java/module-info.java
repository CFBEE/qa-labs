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
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;

    opens main.java.lab11_Testing to org.junit.platform.commons;
    opens main.java.lab12_AccessingFiles to gson;

    exports lab14_StreamsAndLambdas to com.fasterxml.jackson.databind;

}