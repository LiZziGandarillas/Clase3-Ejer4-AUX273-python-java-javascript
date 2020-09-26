process.stdin.on('data',function(data){
	var n=parseInt(data.toString());
	var a=1, b=0, c=0, suma=0;
	for(var i=0; i<n; i++)
	{
		suma=suma+c;
		c=a+b;
		a=b;
		b=c;
	}
	console.log(suma);
	process.exit();
});
