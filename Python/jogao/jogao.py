tempoDejogo = int(input("Quanto tempo temos de jogado? "))
placarMeutime = int(input("Qual é o placar do meu time? "))
placarSeutime = int(input("Qual é o placar do time adversario? "))

if tempoDejogo <= 90:
    print("Ainda tem jogo pela frente")
    print("Que bom porque adoro futebol")
else:
    print("Putz, ta acabando o jogo")
    if placarMeutime >= placarSeutime:
        print("Apita logo juiz!!!!!")
    else:
     print("Espera um pouquinho juiz!!!!")
    
                    
