# Fibonacci RESTful web server

## Functionality

The web server will hold a service at route "/fibonacci", 
it will take HTTP GET request with one parameter "n" and return the fibonacci array of length n.
The parameter "n" default as 5.

## Deploy

You can run it directly by typing
```
./gradlew bootRun
```

Spring will start the service at localhost:8080

Then visit localhost:8080/fibonacci in your browser to see the result.

### Error handle

If the number n provided is invalid, the server will return '400 Bad Request'.

## Test

Unit test are provided in `src/test`. To run it, use gradle:
```
./gradlew test
```

Three tests are provided: Request with no parameter, with valid parameter and with invalid parameter.