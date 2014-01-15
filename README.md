Capedwarf RPC Endpoint Example
========================

Build and deploy on App Engine development server
---

> mvn clean compile appengine:devserver

Build and deploy on CapeDwarf
---

> mvn clean compile package

Copy the ROOT.war from the target subdirectory to the CapeDwarf deployment directory.

Running the example
---

Go to

> http://localhost:8080/

Clicking the "Get data" button there will be 2 json-rpc calls to the server.
After the calls the JSON response will be shown.



