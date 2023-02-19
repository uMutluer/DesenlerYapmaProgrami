fun main() {
        print("Hangi deseni çizmek istersiniz? " +
                "")
        val pattern = readLine()!!.toInt()


        when (pattern) {
            1 -> {
                for (i in 1..5) {
                    for (j in 1..i) {
                        print("* ")
                    }
                    println()
                }
            }
            2 -> {
                for (i in 5 downTo  1) {    //burada .. neden işe yaramadı?
                    for (j in 1..i) {
                        print("* ")
                    }
                    println()
                }
            }
            3 -> {
                for (i in 1..5) {
                    for (j in 5 downTo i) {   //2 ile 3 aynı işi yapan döngüler
                        print("* ")
                    }
                    println()
                }
            }
            4 -> for(i in 1..5){
                for(i in 1..5)
                {
                    print("* ")
                }
                println()
            }
            else -> {
                println("Hatalı seçim!")
            }
        }
    }









