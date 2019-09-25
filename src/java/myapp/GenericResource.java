/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author 1894192
 */
@Path("cegepgim")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of myapp.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Path("method1")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {

        return "Hello MAD 311";

    }

    @GET
    @Path("method2")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText1() {

        return "Hello MAD 311-Good Students";

    }

    @GET
    @Path("method3&{theName}&{theAge}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText2(@PathParam("theName") String name, @PathParam("theAge") int age) {

        return "Hello " + name + " your age is " + age;

    }

    @GET
    @Path("sum&{theNum1}&{theNum2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText2(@PathParam("theNum1") int number1, @PathParam("theNum2") int number2) {

        int sum = number1 + number2;
        return "Result is " + number1 + " add " + number2 + "= " + sum;

    }

    @GET
    @Path("method4")
    @Produces(MediaType.TEXT_HTML)
    public String getText4() {

        return "<p><b><i><strong>Hello MAD 311</strong></i></b></p>";

    }

    @GET
    @Path("method5")
    @Produces(MediaType.APPLICATION_XML)
    public String getText5() {

        return "<note><to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend</body></note>";

    }

    @GET
    @Path("method6")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText6() {

        return "{\"id\":12345,\n"
                + "\"fname\":\"Ami\",\n"
                + "\"lname\":\"Parekh\",\n"
                + "\"GPA\":72.3}";
    }
    @GET
    @Path("employee&{fname}&{lname}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getText7(@PathParam("fname") String firstName,@PathParam("lname") String lastName) {
    return "{\"id\":1,\n" +
"\"FirstName\" : '"+firstName+"',\n" +
"\"LastName\": '"+lastName+"',\n" +
"\"Salary\":$1000}";
}

}
