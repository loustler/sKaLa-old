* 공변(covariant)
    * Type Args 앞에 +를 추가해서 표기
        * `[+A]`
 
    * 가변 지정자(variance annotation : 가변주해)
    * 위의 예제와 같은 args를 양(positive)의 매개변수 라고 함 
    * explain
        * 만일 Dog가 Animal의 subtype이면 List[Dog]가 List[Animal]의 subtype으로 간주된다
        * generally
            * X가 Y의 subtype일 때, 모든 type X와 Y에 대해 List[X]는 List[Y]의 하위형식이다

* 불변(invariant)
    * 공변(covariant)과 달리 Type Args앞에 +가 없으면 불변(invariant)
        *`[A]`

* covariant에 대해
 자바와 비교할 수는 없으나 이해를 하기 위해 비교 아닌 비교를 하자면 아래와 같다.
 > Java 에서 `List<Dog>`가 `List<Animal>`의 서브타입이 될 수는 없다

 > 그러나 Scala의 covariant는 서브타입이 될 수 있다.

* 자바에서 covariant가 될 경우 문제점

```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Object> objects = numbers;
objects.add("aaa");
```

이 성립할 가능성이 있기 때문에 불가능

> Scala의 List는 immutable이라 나중에 추가될 수가 없음

수정할 부분이 있으면 수정해주세요 
정확하지 않을 수 있습니다.

이 contents는 케빈님의 도움을 받았습니다. 


------------------------------------------------------
출처 : [스칼라 스터디](https://github.com/codechobostudy/study-dev-scala/wiki/공변(covariant)과-불변(invariant))