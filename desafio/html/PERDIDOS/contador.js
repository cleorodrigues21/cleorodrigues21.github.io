function contador(){
var ForReading = 1;
fso = new ActiveXObject("Scripting.FileSystemObject");
if(fso.FileExists("contador.txt") == false){
f1 = fso.CreateTextFile("contador.txt", true);
f1.Write(1);
f1.WriteBlankLines(1);
f1.Close();}

ts = fso.OpenTextFile("contador.txt", ForReading);
s = ts.ReadLine();
visitas = s.length;
ts.Close();

f2 = fso.CreateTextFile("contador.txt", true);
f2.WriteLine(s+1);
f2.Close();
document.write(visitas);
}



