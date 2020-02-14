# jce-redsky-demo
Redsky product API demo

#Project Setup
To setup this project first clone this repository. It does have one dependency that needs to be installed and running, Redis Database.
If you are running windows 10, instalation instructions are here: https://redislabs.com/blog/redis-on-windows-10/
If you are on OSX it can be installed using homebrew: brew install redis
If you are on linux it can be installed via apt-get sudo apt-get install redis-server

Once you have Redis running you can feel free to add test data to any of the is you want either via the redis console, or via a put 
request that expects a full product json object ({"id":13860428,"name":"The Big Lebowski (Blu-ray) (Widescreen)","current_price":{"value": 13.49,"currency_code":"USD"}}).

To run the API requests can be sent via PostMan (https://www.postman.com/) or with a browser.
