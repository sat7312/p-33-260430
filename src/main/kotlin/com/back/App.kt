package com.back

import com.back.domain.system.controller.SystemController
import com.back.domain.wiseSaying.controller.WiseSayingController
import com.back.global.Rq
import com.back.global.SingletonScope

class App(
    val wiseSayingController: WiseSayingController = SingletonScope.wiseSayingController,
    val systemController: SystemController = SingletonScope.systemController
) {

    fun run() {

        println("== 명언 앱 ==")

        while (true) {
            print("명령) ")

            val input = readln().trim()
            val rq = Rq(input)

            when (input) {
                "종료" -> {
                    systemController.exit()
                    break;
                }
                "등록" -> wiseSayingController.write()
                "목록" -> wiseSayingController.list()
                "삭제" -> wiseSayingController.delete(rq)
                "수정" -> wiseSayingController.modify(rq)
            }
        }
    }
}
