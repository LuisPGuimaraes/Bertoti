# Anti-pattern Composite: Deus das Árvores

Grandes menus, estruturas de arquivos ou organogramas às vezes acabam centralizados em uma única classe "manager" com dezenas de listas internas. O exemplo `MegaMenuBuilder` mostra esse anti-pattern, enquanto `CompositeMenu` demonstra a alternativa elegante.

## Sintomas
- Métodos como `addItemNivel3()` começam a nascer.
- Impossibilidade de reutilizar um ramo da árvore.
- Novos níveis significam novos campos no objeto gigante.

## UML do anti-pattern
`diagram.puml` ilustra a classe `MegaMenuBuilder` carregada de listas fixas para cada nível da árvore.

> Para ver o Composite correto funcionando, abra a pasta `composite-pattern`.

## Arquivos
- `AntiPatternExample.java`: mega classe com arrays fixos.
