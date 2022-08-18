package com.acme.app;

/**
 * Hello world!
 *
 */
public class App 
{
    private String caption;

    App() {
        this.setCaption("Hello World!");
    }

    App(String caption) {
        this.setCaption(caption);
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String value) {
        this.caption = value;
    }

    public static void main( String[] args )
    {
        App app = new App();

        app.setCaption("Hello Jordyn!");

        System.out.println( app.getCaption() );
    }
}
