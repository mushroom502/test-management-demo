# test-management-demo

本仓库为测试管理实践示例，包含一个简单的 `Calculator` 类及对应的单元测试。目标是展示如何将单元测试与持续集成、缺陷跟踪和构建流程结合使用。

关键点：

- 版本控制：可使用 GitHub/Gitee/GitLab 等任一 Git 仓库托管代码。
- 持续集成：已包含 GitHub Actions 工作流 `.github/workflows/ci.yml`，并额外提供 `Jenkinsfile` 作为 Jenkins 管道示例。
- 缺陷跟踪：在 `.github/ISSUE_TEMPLATE/bug_report.md` 中提供了缺陷提交模版。

如何本地运行：

1. 打包（生成 jar）：
```
mvn -B package -DskipTests
```

2. 运行单元测试（冒烟测试）：
```
mvn -B test
```

说明：

- Maven 的 `package` 目标用于生成完整 jar 包（build），`test` 目标用于执行单元测试（test）。
- GitHub Actions 配置位于 `.github/workflows/ci.yml`，会在 push 到 `main` 时执行打包和测试步骤。
- Jenkins 使用 `Jenkinsfile` 定义流水线：先打包（跳过测试），再执行测试（冒烟测试），并收集 JUnit 报告。

缺陷提交流程（常规建议）：

1. 在 issue 中使用提供的缺陷模板填写信息。
2. 指定重现步骤、环境、日志与期望行为。
3. 指派负责人并标注优先级/影响范围。
4. 修复后在 PR 描述中关联 issue，并在 CI 验证通过后关闭 issue。
# test-management-demo
软件测试实验
