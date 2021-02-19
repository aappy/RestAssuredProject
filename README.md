# RestAssuredProject
REST- Parameterization
How to run test multiple times with different sets of data
How to provide data from the same class
How to provide data from different class
how to provide TestNg parameters
-
Mockoon: We can use this tool for mock apis. Aslso by using json-server we can can create rest apis.
github.com/typicode/json-server 
to install - 
npm install -g json-server
download NODE.Js incan you dont have.
-
npm package install permission issue on macbook:
-
npm --version
npm config get prefix [it will tell us where node is located]
-
npm install -g json-server [This might give permission error on MAC so please use below cmd  ]
-
sudo chown -R $(whoami) $(npm config get prefix)/{lib/node_modules,bin,share}
