# 访问修饰符
|    | 本类| 同包| 非同包子类| 其他包|
|:---:|:---:|:---:|:---:|:---:|
| private | √ | × | × | × |
| default | √ | √ | × | × |
| protected | √ | √ | √ | × |
| public | √ | √ | √ | √ |

# 继承
1. Java只支持单继承，不支持多继承
2. 子类继承父类，则子类拥有父类的非私有成员
3. 子类继承父类，则子类拥有父类的非私有成员，但子类不能继承父类的构造方法   

# 多态
父类引用指向子类对象，从而产生多种形态
```java
Pet pet = new Dog();
```
- Pet: 父类引用（引用类型）
- Dog: 子类对象（对象类型）
- 父类引用中保存真实子类对象，称为向上转型。

## 应用场景
- 使用父类最为方法形参实现多态，使方法参数的类型更加灵活
- 使用父类作为方法返回值实现多态，使方法返回不同子类对象

# 向下转型
```
Dog dog = (Dog) pet;
```

# 抽象类和抽象方法

