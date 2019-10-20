# Basic Request Formats

## Get Request
curl http://localhost:8080/topics

## POST Request
curl -d '{"id":"7","name":"Geo","discription":"my fav"}' -X POST http://localhost:8080/topic -H "Content-Type: application/json"

## PUT Request
curl -d '{"id":"7","name":"Geology","discription":"my fav"}' -X PUT  http://localhost:8080/topic/7 -H "Content-Type: application/json"

## Delete Request
curl  -X DELETE  http://localhost:8080/topic/7 -H "Content-Type: application/json"
