# buildingAPIRest
## You have to write the necessary code to prepare the project and complete the construction of the API, using POSTMAN.
This time there are no **test cases**. You can implement them by reusing the code of test cases from the practices of the previous two 
weeks, learning about `MockMVC`.

### @RESTCONTROLLER
Spring provides an `@RestController` annotation to indicate that a class plays the role of **REST** driver:
https://javabrains.io/courses/spring_bootquickstart/lessons/Adding-a-REST-Controller/

### RESOURCES AND THE API - ROUTERS
What are the resources that will be accessed by the routers?
What is the API? What are the routers?
https://javabrains.io/courses/spring_bootquickstart/lessons/The-REST-API-we%27ll-build/

- The `Topic` class is built in this video:
    https://javabrains.io/courses/spring_bootquickstart/lessons/Returning-Objects-From-Controller/

### CREATING A SERVICE
The `/topics` controller returns all the existing topics:

https://javabrains.io/courses/spring_bootquickstart/lessons/Creating-a-business-service/

Note that there is a bug in `TopicService` that is fixed in video *2.5 Creating a new resource using POST*. The `Topic` `ArrayList` has 
to be mutable to insert new objects.

### CREATING A SERVICE WITH LAMBDA EXPRESSIONS
The `/topics/{id}` driver returns the *topic* with the indicated `id`:

https://javabrains.io/courses/spring_bootquickstart/lessons/Getting-a-single-resource/

Also, in the programming of the service you will find a nice lambda expression.

Eye to the `@PathVariable` annotation.

### CREATING A RESOURCE USING POST - POSTMAN
To create a new resource we need the POST method. We have seen in the lesson videos how it is indicated, but here we will do it with 
REST:

https://javabrains.io/courses/spring_bootquickstart/lessons/Creating-a-new-resource-using-POST/

Eye to the annotations :

- `method=RequestMethod.POST, value = /topics` to indicate that this driver is a POST message.
- `@RequestBody to convert the JSON format of the entry into a `Topic` object.

**Postman** allows POST requests to your Spring app from the browser. It is used a lot, so you have to know it:

https://www.getpostman.com/

### UPDATE (PUT) AND DELETE
https://javabrains.io/courses/spring_bootquickstart/lessons/Implementing-Update-and-Delete/

To implement an update in our Topic ArrayList we use the PUT method:

- `method=RequestMethod.PUT, value = /topics/{id} to indicate that this controller is a PUT message and that it needs the `id` 
parameter of the *Topic* to be updated.
- `@RequestBody` to convert the JSON format of the entry into a `Topic` object and `@PathVariable` to pick up the `id` parameter.

The driver to remove a Topic makes use of:

- `method=RequestMethod.DELETE, value= /topics/{id}` to indicate that this controller is a DELETE message and that it needs the `id` 
parameter of the *Topic* to be deleted.
- `@PathVariable` to pick up the `id` parameter.

*Postman* allows you to make PUT and DELETE requests.
