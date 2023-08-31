//                             Задание
// Написать метод, которы принимает 2 логических переменных isTodayFriday, aLotOfMoney.
// Т.е. сегодня пятница и у вас много денег. Выведите на консоль следующее:
// -если сегодня пятница и у вас много денег, то пойти в бар и выпить пивка;
// -если пятница, но денег нет, то попросить в долг у друга и пойти с ним попить пивка;
// -во всех остальных случаях(если не пятница и денег нет) пойти домой и поесть гречи.

fun main(args: Array<String>) {
    chooseToDrink(true,true)
    chooseToDrink(true,false)
    chooseToDrink(false,true)
    chooseToDrink(false,false)

}

fun chooseToDrink(isToFriday: Boolean, aLotOfMoney: Boolean) {
    if (aLotOfMoney) {
        println("I'm going to drink")
    } else if (isToFriday) {
        println("Gonna lend some money and go to drink")
    } else {
        println("Just go home and eat some food")
    }
}