package oop.collection.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardExample {

    private Scanner sc = new Scanner(System.in);
    private List<Board> boards = new ArrayList<>();
    public void list(){
        System.out.println();
        System.out.println("[게시물 목록]");
        readAll();
//        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter", "2024.01-01", "게시판에 오신 것을 환영합니다.");
//        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "winter", "2024.01-01", "올 겨울은 많이 춥습니다.");
        mainMenu();
    }

    public void readAll() {
        System.out.println("-------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        for (Board board : boards)
        {
            System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
        }

        System.out.println("-------------------------------------");
    }

    public void mainMenu() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("1.메인 메뉴 : 1.Create | 2. Read | 3. Clear | 4.Exit");
        System.out.println("메뉴선택:");
        String menuNo = sc.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }
    private void create()
    {
        Board row = new Board();

        System.out.println("[새 게시물 입력]");
        row.setBno(boards.size()+1);
        System.out.print("제목: ");
        String title = sc.nextLine();
        row.setBtitle(title);
        System.out.print("내용: ");
        String content = sc.nextLine();
        row.setBcontent(content);
        System.out.print("작성자: ");
        String writer = sc.nextLine();
        row.setBwriter(writer);
        row.setBdate(getCurrentDate());

        //보조메뉴 출력
        System.out.println("-------------------------------------");
        System.out.println("보조 메뉴: 1. Ok |  2. Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();
        if(menuNo.equals("1"))
        {
            try{
                boards.add(row);
                System.out.println("게시물 추가 완료!");
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
                exit();
            }
        }
        list();
    }

    private void read()
    {
        System.out.println();
        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        for (Board board : boards)
        {
            if(board.getBno() == bno)
            {
                System.out.println("#########################");
                System.out.println("번호 : " + board.getBno());
                System.out.println("제목 : " + board.getBtitle());
                System.out.println("내용 : " + board.getBcontent());
                System.out.println("작성자 : " + board.getBwriter());
                System.out.println("날짜 : " + board.getBdate());
                System.out.println("------------------------------------------------------");
                flag = false;
            }
        }
        if(flag)
        {
            System.out.println("해당 번호의 게시물이 없습니다 !!!");
            list();
        }

        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택:");
        int menuNo = Integer.parseInt(sc.nextLine());
        if(menuNo == 1)
        {
            try{
                update(bno);
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
                exit();
            }
        }
        else if(menuNo == 2)
        {
            try
            {
                delete(bno);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                exit();
            }
        }


        list();
    }

    private void clear() {
        boards.clear();
        list();
    }

    private void exit()
    {
        System.out.println("**게시판 종료 **");
    }

    private void update(int bno)
    {
        System.out.print("제목 : ");
        String btitle = sc.nextLine();
        System.out.print("내용 : ");
        String bcontent = sc.nextLine();
        System.out.print("작성자 : ");
        String bwriter = sc.nextLine();

        System.out.println("-------------------------------------");
        System.out.println("보조 메뉴: 1. Ok |  2. Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();
        if(menuNo.equals("1"))
        {
            try
            {
                for (Board board : boards)
                {
                    if(board.getBno() == bno)
                    {
                        board.setBtitle(btitle);
                        board.setBcontent(bcontent);
                        board.setBwriter(bwriter);
                        break;
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                exit();
            }
        }
        list();

    }

    public void delete(int bno)
    {
        boards.remove(bno-1);
    }
    public String getCurrentDate()
    {
        SimpleDateFormat date = new SimpleDateFormat("yyyy--MM--dd");
        String currentDate = date.format(new Date());
        return currentDate;
    }

    public static void main(String[] args) {
        BoardExample boardExample = new BoardExample();
        boardExample.list();
    }
}
