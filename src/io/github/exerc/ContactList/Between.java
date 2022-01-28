import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Between {

    LinkedList<ContacPerson> lista = new LinkedList<ContacPerson>();    
    ListIterator<ContacPerson> item = lista.listIterator();
    Scanner input = new Scanner(System.in);    
    
    public Between(){

    }

    public void Menu(){

        String nome1, nome2, nome3;
        String end1, end2, end3, end4, end5;
        String tel1, tel2;
        String em1, em2;     
        int menu = 143;
        int flag;

       
        do{

            System.out.printf("\nDigite [0] para sair.");
            System.out.printf("\nDigite [1] para cadastrar contato.");
            System.out.printf("\nDigite [2] para procurar contato pelo nome.");
            System.out.printf("\nDigite [3] para procurar contato pelo telefone.");
            System.out.printf("\nDigite [4] para remover contato por nome.");
            System.out.printf("\nDigite [5] para apresentar contatos.");
            System.out.printf("\nDigite: ");
            menu = input.nextInt();

            switch(menu){
                case 0:
                    System.out.println("\nSAIU!!\n");
                break;
                case 1:
                    //CADASTRAR NOVO CONTATO
                    System.out.println("\nDigite o primeiro nome ");
                        nome1 = input.nextLine();
                        nome1 = input.nextLine();
                    System.out.println("\nDigite o nome do meio: ");
                        nome2 = input.nextLine();
                    System.out.println("\nDigite o ultimo nome");
                        nome3 = input.nextLine();
                        Name n = new Name(nome1, nome2, nome3);
                    System.out.println("\nDigite a rua: ");
                        end1 = input.nextLine();
                    System.out.println("\nDigite o numero: ");
                        end2 = input.nextLine();
                    System.out.println("\nDigite a cidade: ");
                        end3 = input.nextLine();
                    System.out.println("\nDigite o estado: ");
                        end4 = input.nextLine();
                    System.out.println("\nDigite o codigo postal: ");
                        end5 = input.nextLine();
                        Address a = new Address(end1, end2, end3, end4, end5);
                    System.out.println("\nDigite o telefone: ");
                        tel1 = input.nextLine();
                    System.out.println("\nDigite o DDD: ");
                        tel2 = input.nextLine();                    
                        Phone p = new Phone(tel1, tel2);
                    System.out.println("\nDigite o dominio: ");
                        em2 = input.nextLine();
                    System.out.println("\nDigite o user: ");
                        em1 = input.nextLine();
                        E_mail e = new E_mail(em1, em2);
                        ContacPerson nova_pessoa = new ContacPerson(n, a, p, e);
                        lista.add(nova_pessoa);                       

                break;
                case 2:
                    //PROCURAR CONTATO PELO NOME
                    System.out.println("\nDigite o primeiro nome: ");
                        nome1 = input.nextLine();
                        nome1 = input.nextLine();
                    item = lista.listIterator();
                    flag = 0;
                    while(item.hasNext()){
                        ContacPerson c = item.next();
                        if(c.toString().contains(nome1)){
                            System.out.println(c.toString());
                            flag = 1;
                        }                         
                    }
                    if(flag==0)
                        System.out.println("\nContato nao Existe!!\n");                    
                break;
                case 3:
                    //PROCURAR CONTATO PELO TELEFONE
                    System.out.println("\nDigite o telefone: ");
                    tel1 = input.nextLine();
                    tel1 = input.nextLine();
                    item = lista.listIterator();
                    flag = 0;
                    while(item.hasNext()){
                        ContacPerson c = item.next();
                        if(c.toString().contains(tel1)){
                            System.out.println(c.toString());
                            flag = 1;
                        }                         
                    }
                    if(flag==0)
                        System.out.println("\nContato nao Existe!!\n");
                break;                                 
                case 4:
                    //REMOVER UM CONTATO
                    System.out.println("\nDigite o primeiro nome ");
                        nome1 = input.nextLine();
                        nome1 = input.nextLine();
                    item = lista.listIterator();
                    flag = 0;
                    while(item.hasNext()){
                        ContacPerson c = item.next();
                        if(c.toString().contains(nome1)){
                            item.remove();
                            flag = 1;
                        }                         
                    }
                    if(flag==0)
                        System.out.println("\nContato nao Existe!!\n"); 
                    else if(flag == 1)
                        System.out.println("\nContato Removido!!\n");                   
                break;
                case 5:
                    //MOSTRAR TODOS OS CONTATOS  
                    item = lista.listIterator();
                    flag = 0;
                    while(item.hasNext()){
                        ContacPerson c = item.next();
                        System.out.println(c);  
                        flag = 1;                     
                    }
                    if(flag == 0)
                        System.out.println("Lista Vazia!!\n");                     
                break;
                default:
                    System.out.println("\nDigite um valor valido!\n");
            }
        }while(menu!=0);
    }

}