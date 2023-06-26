<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>예약 요청</title>
    <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
    <script>
    	$(document).ready(function() {
    		$("#getDataBtn").click(getJson);
    	});

    	function getJson() {
    		$.ajax({
    			url : "main.do",
    			type : "post",
    			dataType : "json", // 응답 받을 데이터 타입
    			success : function(data){
    				alert("응답 받은 데이터 : " + data);

    				// 전달 받은 JSON 데이터 처리
                    let htmlTag = "";
                    let alist = data.list; // JSON 객체 속성명 "list"의 값 추출
                    $.each(alist, function(index, member){ // this.name = member.name
                        htmlTag += "<tr>";
                        htmlTag += "<td>" + this.custNo + "</td>"; // 정적
                        htmlTag += "<td>" + this.membNo + "</td>";
                        htmlTag += "<td>" + this["CUST_IDNT_NO"] + "</td>"; // 동적 (변수 사용 가능)
                        htmlTag += "<td>" + this["CONT_NO"] + "</td>";
                        htmlTag += "<td>" + this["PAKG_NO"] + "</td>";
                        htmlTag += "<td>" + this["CPON_NO"] + "</td>";
                        htmlTag += "<td>" + this["LOC_CD"] + "</td>";
                        htmlTag += "<td>" + this["roomTypeCd"] + "</td>";
                        htmlTag += "<td>" + this["arrvDate"] + "</td>";
                        htmlTag += "<td>" + this["rsrvRoomCnt"] + "</td>";
                        htmlTag += "<td>" + this["ovntCnt"] + "</td>";
                        htmlTag += "<td>" + this["inhsCustNm"] + "</td>";
                        htmlTag += "<td>" + this["inhsCustTelNo2"] + "</td>";
                        htmlTag += "<td>" + this["inhsCustTelNo3"] + "</td>";
                        htmlTag += "<td>" + this["inhsCustTelNo4"] + "</td>";
                        htmlTag += "<td>" + this["rsrvCustNm"] + "</td>";
                        htmlTag += "<td>" + this["rsrvCustTelNo2"] + "</td>";
                        htmlTag += "<td>" + this["rsrvCustTelNo3"] + "</td>";
                        htmlTag += "<td>" + this["rsrvCustTelNo4"] + "</td>";
                        htmlTag += "<td>" + this["refreshYn"] + "</td>";
                        htmlTag += "</tr>";
    				});

    				$("#tbody").html(htmlTag);
    			},
    			error : function(jqXHR, textStatus, errorThrown){
    				alert(">> Ajax fail - error \n"
    						+ "jqXHR.readyState : " + jqXHR.readyState + "\n"
    						+ "textStatus : " + textStatus + "\n"
    						+ "errorThrown : " + errorThrown);
    			}
    		});
    	}
    </script>
</head>

<body>
    <h2>예약 서비스 선택</h2>
    <button id="getDataBtn">예약 요청</button>
    <hr>
    <table border>
            <thead>
                <tr>
                    <th>고객 번호</th>
                    <th>회원 번호</th>
                    <th>고객 식별 번호</th>
                    <th>계약 번호</th>
                    <th>패키지 번호</th>
                    <th>쿠폰 번호</th>
                    <th>객장 코드</th>
                    <th>객실 타입 코드</th>
                    <th>예약 날짜(도착 일자)</th>
                    <th>예약 객실 수</th>
                    <th>박수</th>
                    <th>투숙 고객명</th>
                    <th>투숙 고객 전화번호 2</th>
                    <th>투숙 고객 전화번호 3</th>
                    <th>투숙 고객 전화번호 4</th>
                    <th>리프레쉬 여부</th>
                </tr>
            </thead>
            <tbody id="tbody">
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>
            </tbody>
        </table>
</body>

</html>