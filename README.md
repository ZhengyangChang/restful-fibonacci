# Fibonacci RESTful web server

## Functionality

A RESTful server base on [Spring](https://spring.io).

The web server will hold a service at route "/fibonacci", 
it will take HTTP GET request with one parameter "n" and return the fibonacci array of length n.
The parameter "n" default as 5.

## Deploy

You can run it directly by typing
```
./gradlew bootRun
```

Spring will start the service at localhost:8080

Then visit `http://localhost:8080/fibonacci` in your browser to see the result.

To test with other n value, visit `http://localhost:8080/fibonacci?n=60` and so on.

#### Error handle

If the number n provided is invalid, the server will return `400 Bad Request`.

## Test

Unit test are provided in `src/test`. 

I use the test tools provided by Spring package.

To run it, use gradle:
```
./gradlew test
```

Three tests are provided: Request with no parameter, with valid parameter and with invalid parameter.
