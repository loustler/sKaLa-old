# Loan Pattern

빌려주기 패턴

제어 추상화를 하는 function이 자원을 열어 특정 function(arg?)에게 해당 자원을 빌려주기 때문 

> function 내부에 있는 자원을 function arg(function literal)에게 사용할 수 있게 하는 function<br>
  function의 자원을 function 안에서 처리하므로 안정성도 보장될 수 있다??


# example


```
def withPrintWriter(file: File, op: PrintWriter => Unit) = {
  val writer = new PrintWriter(file)

  try { 
    op(writer)
  } finally {
    writer.close
  }
}
```
**Programming in scala의 예제**

Loan Pattern이라고 설명

-----
Written by @loustler at 02/26/17.
It based on wiki of loustler.