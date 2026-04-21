pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build (package)') {
            steps {
                // 打包，不运行单元测试（用于生成 artifact）
                sh 'mvn -B package -DskipTests'
            }
        }
        stage('Test (smoke)') {
            steps {
                // 执行测试（冒烟测试）
                sh 'mvn -B test'
            }
        }
    }
    post {
        always {
            // 收集 junit 报告（需要安装 JUnit 插件）
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
