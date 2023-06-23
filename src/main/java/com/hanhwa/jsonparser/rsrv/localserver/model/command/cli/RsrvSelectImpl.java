package com.hanhwa.jsonparser.rsrv.localserver.model.command.cli;

import java.util.Scanner;

public class RsrvSelectImpl implements RsrvSelect{
    static  Scanner sc = new Scanner(System.in);
    final static String REGEX = "[0-9]+";

    private static String selectSC;
    private static int choice = 0;

    @Override
    public int selectService() {
        int select = 0;
        while(true) {
            System.out.println(">> 이용하실 예약 서비스 번호를 입력해주세요.");
            System.out.println("1. 예약 신청" + "\n"
                                + "2. 예약 수정" + "\n"
                                + "3. 예약 취소" + "\n"
                                + "4. 예약 기간 조회");
            select = selectNum(4);
            return select;
        }
    }

    @Override
    public int selectNum(int selectCnt) {
        while(true) {
            System.out.println();
            System.out.print("입력 > ");
            selectSC = sc.nextLine();

            if (selectSC.matches(REGEX)) {
                if (selectSC.getBytes().length == 1) {
                    choice =  Integer.parseInt(selectSC);
                    if ( choice > selectCnt || choice < 0) {
                        System.err.println("[오류] 주어진 선택지를 입력해주십시오.");
                        continue;
                    } else {
                        break;
                    }
                } else {
                    System.err.println("[오류] 한자리 숫자를 입력해주십시오.");
                    continue;
                }
            } else {
                System.err.println("[오류] 숫자를 입력해주십시오.");
                continue;
            }
        }
        return choice;
    }
}
