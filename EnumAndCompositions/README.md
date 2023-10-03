## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Enumerações
- Tipo especial para especificar de forma literam um conjunto de constantes relacioandas
- enum
- Clico de vida de um pedido, ex: pendingPayment => Processing => Shipped => Delivered

    `
    public enum OrderStatus {
        PENDING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED;
    }
    `

``Converter uma string para Enum``
Quando o uysuario envia uma string, de um form e tal, 
- orderStatus.valueOf("DELIVERED");