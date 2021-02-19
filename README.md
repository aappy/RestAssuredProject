# RestAssuredProject
REST- Parameterization
How to run test multiple times with different sets of data
How to provide data from the same class
How to provide data from different class
how to provide TestNg parameters
-
Mockoon: We can use this tool for mock apis. Also by using json-server we can create rest apis.
github.com/typicode/json-server 
to install - 
npm install -g json-server
download NODE.Js in case you dont have.
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
Start JSON Server:
json-server --watch db.json
So it will create a dummy data for us
-
[It will create db.json file with dummy data. And we can see it on "localhost:3000".  Please see below screenshot]
-
![Screen Shot 2021-02-19 at 12 04 30 PM](https://user-images.githubusercontent.com/46041564/108555767-c6c8fe80-72aa-11eb-82f3-cf119c917f2c.png)
