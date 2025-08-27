Espaço dedicado aos aprendizados de design pattern

| **Categoria** | **Strategy** | **Observer** | **Composite** |
|---------------|--------------|--------------|---------------|
| **Descrição** | Define uma família de algoritmos, encapsula cada um e os torna intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam. | Define uma dependência 1:N entre objetos, de forma que, quando um objeto muda de estado, todos os seus dependentes são notificados automaticamente. | Compõe objetos em estruturas de árvore para representar hierarquias "parte-todo". Permite tratar objetos individuais e composições de maneira uniforme. |
| **Técnicas de POO** | - Encapsulamento<br>- Composição ao invés de herança<br>- Polimorfismo | - Acoplamento fraco<br>- Delegação<br>- Encapsulamento de mudanças | - Recursividade<br>- Polimorfismo<br>- Encapsulamento |
| **Anti-pattern** | Herança | **Spaghetti Code** (quando as notificações não são controladas e causam cascata de eventos imprevisíveis) | **God Object** (quando um único objeto central tenta controlar toda a estrutura) |
| **Aplicação** | Sistemas de pagamento (crédito, débito, Pix), cálculo de frete (Sedex, PAC, transportadora) | Notificações em aplicativos (WhatsApp, e-mail), atualização de interface gráfica, eventos em sistemas de bolsa de valores | Sistemas de arquivos (pastas e arquivos), menus em interfaces gráficas, estruturas organizacionais de empresas |
