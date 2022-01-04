/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console_chat;

/**
 *
 * @author pokem
 */
import java.util.Scanner;
import server.Server;
import client.Client;

/**
 * 
 * @author pokem
 */
public class Console_Chat {

	/**
	 * Спрашивает пользователя о режиме работы (сервер или клиент) и передаёт
	 * управление соответствующему классу
	 * 
	 * @param args
	 *            параметры командной строки
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Запустить программу в режиме сервера или клиента? (S(erver) / C(lient))");
            OUTER:
            while (true) {
                char answer = Character.toLowerCase(in.nextLine().charAt(0));
                switch (answer) {
                    case 's':
                        new Server();
                        break OUTER;
                    case 'c':
                        new Client();
                        break OUTER;
                    default:
                        System.out.println("Некорректный ввод. Повторите.");
                        break;
                }
            }
	}

}
