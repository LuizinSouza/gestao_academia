# 🏋️‍♂️ Sistema de Gestão de Academia

> Sistema full-stack desenvolvido em Spring Boot e Bootstrap 5 para o gerenciamento completo de academias, abrangendo controle de alunos, professores, planos, mensalidades, avaliações físicas e fichas de treino.

---

## 🚀 Tecnologias e Arquitetura

O projeto foi construído utilizando tecnologias modernas de mercado para o desenvolvimento backend e frontend, com foco em boas práticas de arquitetura REST:

### **Backend**
* **Java**
* **Spring Boot** (Spring Data JPA, Spring Web)
* **H2 Database** (Banco de dados relacional em memória, inicializado via ciclo de vida da aplicação)
* **Padrões de Projeto & Resoluções Técnicas:** 
  * Tratamento de persistência com mapeamento de relacionamento robusto (`CascadeType` e remoção em cascata para limpeza automática de dados).
  * Prevenção de exceções de transiente (`TransientObjectException`) via consultas de ID na camada de serviço.
  * Resolução de referências circulares em serialização JSON através de `@JsonIgnore` nas relações bidirecionais.

### **Frontend & Interface**
* **HTML5 & JavaScript (Vanilla)**
* **Bootstrap 5** (Framework CSS para responsividade e design system personalizado em tom vermelho/rosa corporativo)
* **Bootstrap Icons** (Biblioteca de ícones vetoriais integrada)

---

## ✨ Funcionalidades Principais

* **Gestão de Planos:** Cadastro, listagem e remoção de planos de assinatura com definição de valores e duração.
* **Gestão de Professores:** Registro de corpo docente com especialidades e contactos.
* **Gestão de Alunos:** Matrícula de alunos vinculados a um plano específico, incluindo dados pessoais e histórico.
* **Controle de Mensalidades:** Acompanhamento de pagamentos e datas de vencimento, com etiquetas visuais (*badges*) dinâmicas e automáticas baseadas no status (Pago/Pendente).
* **Avaliações Físicas:** Registo antropométrico de peso, altura e percentual de gordura dos alunos.
* **Gestão de Treinos:** Atribuição de fichas de treino personalizadas associando Alunos e Professores.
