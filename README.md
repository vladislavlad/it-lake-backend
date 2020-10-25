# IT Lake
A place where you can note progress of your evolution as IT specialist.

This is the backend service for the "IT Lake" service. 
There is a simple view of information for now, but ideologically it is an API service.

QUICK START
-----------
Run
```shell script
cd docker
docker-compose up
cd ..
gradle bootRun
```
Explore
```http request
GET localhost:8080/
```

INSTANCES
---------
Dev stand: https://it-lake.herokuapp.com/

TODO
---------
- [x] CD with deploy to Heroku after merge to master~~
- [ ] CI with tests, sonar
- [ ] Swagger Spec
- [ ] Authorization
