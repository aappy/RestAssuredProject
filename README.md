# RestAssuredProject
REST- Parameterization
How to run test multiple times with different sets of data
How to provide data from the same class
How to provide data from different class
how to provide TestNg parameters
-
Mockoon: We can use this tool for mock apis. Also by using json-server we can can create rest apis.
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

![node_permissionerror](https://user-images.githubusercontent.com/46041564/108553054-01309c80-72a7-11eb-8913-d0cfc151631b.png)
