# LLM-based Test Generation for Refactoring Engines Enhanced by Feature Analysis on Examples
Software refactoring is widely employed to improve software quality. However, conducting refactoring manually is tedious, time-consuming, and error-prone. Consequently, automated and semi-automated tool support is highly desirable for software refactoring in the industry, and most of the main-stream IDEs provide powerful support for refactoring. However, complex refactoring engines and other complex software systems are susceptible to errors, which in turn may result in imperfect and incorrect refactoring. Although large language models(LLMs) have been successfully exploited for software testing, to the best of our knowledge, they have not yet been exploited for testing refactoring engines. To this end, this paper conducts an empirical study to investigate the potential of LLM-based differential testing of refactoring engines. The results of the study suggest that it is less fruitful to generate test cases with traditional LLM prompt engineering, like One-Step prompt engineering and Chain-of-Though prompt engineering. Consequently, we manually analyze 702 real-world bugs associated with refactoring engines, as well as the implementation of four state-of-the-practice refactoring engines (plugins) in main-stream IDEs. From the manual analysis, we summarize a list of features of the bug-revealing test cases (i.e., programs to be refactored), and such features are represented as knowledge. With such knowledge, we employ knowledge-based prompt engineering to generate prompts for LLMs. The resulting test cases reveal in total of 115 previously unknown bugs and 28 inconsistent refactoring behaviors in four state-of-the-practice refactoring engines. Among the 115 bugs,  78 have been confirmed by the original developers of the engines.  

We provide a [Bug Repository](https://assdfsdafasfa.github.io/) that contains all details (test case code before and after refactoring, error reasons, expected results). 

Auto-perform refactoring tools in [RefEclipse](https://github.com/assdfsdafasfa/OpenPaper/tree/main/Eclipse_AutoRefactor) and [RefIDEA](https://github.com/assdfsdafasfa/OpenPaper/tree/main/IDEA_AutoRefactor) package.
Analysis of historical bug in [AnalysisOfHistoricalBug](https://github.com/assdfsdafasfa/OpenPaper/tree/main/AnalysisOfHistoricalBug) package, document name：**BugAnalysisList.xls**
# Prompt Design
**One-Step Prompt Engineering:** Evaluating the potential of directly leveraging ChatGPT to generate test cases for testing refactoring tools.

**Chain-of-Thought Prompting:** First, utilize ChatGPT's scenario analysis capabilities to analyze all scenarios that may lead to mutation errors or inconsistent behaviors in refactoring, and use ChatGPT to generate test cases based on each scenario.

**LLM-based Test Generation:** By analyzing the bugs of historical refactoring tools, we have obtained all the characteristics affecting the refactoring tools and expanded on this to construct a feature list. The prompts for ChatGPT are composed by randomly selecting combinations of features.

 We design the prompt engineering in the  [Prompt](https://github.com/assdfsdafasfa/OpenPaper/tree/main/Prompt) package. 
# Results
To evaluate the potential of ChatGPT on the task of testing refactoring tools, we set 5 research questions：

RQ1 Impact of ChatGPT Settings:  How do different prompt settings affect ChatGPT’s performance in the testing refactoring engine task?
RQ2 Causes and Mitigation Strategies for testing underperformance:  What are the underlying causes for the underperformance of ChatGPT in testing refactoring engines,  and how to mitigate these questions?
RQ3 Effectiveness of ChatGPT on Testing Refactoring Engine:  How does ChatGPT’s performance compare to state-of-the-art methods?
RQ4 Consistency across refactoring engines: Does ChatGPT test the results of refactoring engines consistently?
RQ5 Refactoring engine bugs and error causes: What refactoring engine bugs were found with ChatGPT?

**Compare the results of different prompted inputs:**

![image](https://github.com/user-attachments/assets/b35ec4ec-efe6-4a71-a913-b94ce5a7ca15)

**Compare SOTA:**

![image](https://github.com/user-attachments/assets/57fc1cb6-bdb0-4cbe-bf93-ca2217f40744)
