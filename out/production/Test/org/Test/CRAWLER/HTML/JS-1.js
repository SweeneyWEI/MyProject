//    function Student() {
//        this.setName=function(name){
//            this.name=name;
//        }
//        this.setAge=function (age){
//            this.age=age;
//        }
//        this.Add=function (a,b) {
//            return a+b;
//        }
//        this.opt=function (){
//            console.log(this.name+" "+this.age);
//        }
//    }
//    var t1=Student();
//    var t2=Student();
//    var t1=new Student();
//    t1.setName("weixin");
//    t1.setAge(20);
//    t1.opt();
function incr() {
    var a=0;
    return function add() {
        return a++;
    }
}

function add() {
    this.newInst=incr;
    this.newInst();
    delete this.newInst;
}

// function add(a,b) {
//     return a+b;
// }
// function Fis(f,a,b) {
//     return f(a,b);
// }
//
// var a={"id":"1","name":"weixin","age":"21"}
//
function List() {
    var ab = [];
    function add(e) {

        ab.push(e);
        return ab[0];
    }
    function sub(f){
        ab.pop();
    }
}
